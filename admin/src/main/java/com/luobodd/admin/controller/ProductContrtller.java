package com.luobodd.admin.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.luobodd.admin.service.BrandService;
import com.luobodd.admin.service.CategoryService;
import com.luobodd.admin.service.ProductService;
import com.luobodd.common.po.Brand;
import com.luobodd.common.po.Category;
import com.luobodd.common.po.Product;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

//@Controller
@RequestMapping("/product")
public class ProductContrtller {
    private String accessKey;
    private String secretKey;
    private String bucket;
    private String domain;

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BrandService brandService;
    @RequestMapping("/productList")
    public String productList(Map<String,Object> map){
        List<Map<String, Object>> productList = productService.productList();
        System.out.println("productList = " + productList);
        map.put("productList",productList);
        map.put("productListSize",productList.size());
        return "product-list";
    }
    @RequestMapping("/productAddPage")
    public String productAddPage(Map<String,Object> map){
        List<Category> categoryList = categoryService.categoryList();
        List<Brand> brandList = brandService.brandList();
        map.put("categoryList",categoryList);
        map.put("brandList",brandList);
        return "product-add";
    }
    @RequestMapping("/productAdd")
    public String productAdd(Product product,HttpSession session){
        Object productFile = session.getAttribute("productFile");
        session.removeAttribute("productFile");
        product.setProductFile(productFile.toString());
        System.out.println("productFile = " + productFile);
        System.out.println("product = " + JSON.toJSONString(product));
        productService.addProduct(product);
        return "redirect:/product/productList";
    }

    @ResponseBody
    @RequestMapping(value = "/upload",produces = "application/json;charset=utf-8")
    public String upload(MultipartFile file,HttpSession session) throws IOException {
        byte[] bytes = file.getBytes();
        //构造一个带指定Zone对象的配置类
        Configuration configuration = new Configuration(Zone.zone0());
        UploadManager uploadManager = new UploadManager(configuration);
        //生成上传凭证，然后准备上传
        System.out.println(accessKey);
        System.out.println(secretKey);
        Auth auth = Auth.create(accessKey, secretKey);
        String uploadToken = auth.uploadToken(bucket);
        //key：如果不设置key，会使用文件内容的hash值作为key
        //同一个文件hash值相同
        Response response = uploadManager.put(bytes, null, uploadToken);
        //获取响应体的字符串
        String bodyString = response.bodyString();
        System.out.println("bodyString = " + bodyString);
        DefaultPutRet putRet = JSON.parseObject(bodyString, DefaultPutRet.class);
        String productFile=domain+putRet.key;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("productFile",productFile);
        session.setAttribute("productFile",productFile);
        return jsonObject.toJSONString();
    }
    @RequestMapping("/productEditPage")
    public String productEditPage(Integer productId,Map<String,Object> map){
        Product product = productService.queryProduct(productId);
        List<Category> categoryList = categoryService.categoryList();
        List<Brand> brandList = brandService.brandList();
        map.put("product",product);
        map.put("categoryList",categoryList);
        map.put("brandList",brandList);
        return "product-edit";
    }
    @RequestMapping("/productEdit")
    public String productEdit(Product product){
        String s = JSON.toJSONString(product);
        System.out.println("s = " + s);
        int i = productService.editProduct(product);
        System.out.println("i = " + i);
        return "redirect:/product/productList";
    }
    @RequestMapping("/startProduct")
    public String productStart(Integer productId){
        System.out.println("productId = " + productId);
        int startProduct = productService.querystartProduct(productId);
        if (startProduct==0){
            productService.startProduct(productId);
            return "redirect:/product/productList";
        }else {
            productService.stopProduct(productId);
            return "redirect:/product/productList";
        }
    }
}
