package pl.sda.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class BucketServiceImpl implements BucketService {

    @Override
    public void addProduct(HttpServletRequest req, Long productId) {
        List<Long> bucket = (List<Long>) req.getSession().getAttribute("bucket");
        if (bucket == null){
            bucket = new ArrayList<>();
            req.getSession().setAttribute("bucket", bucket);
        }
        bucket.add(productId);
    }

    public List<Long> getProductsId(HttpServletRequest request){
        List<Long> productsId = (List<Long>) request.getSession().getAttribute("bucket");
        return productsId == null ? new ArrayList<>() : productsId;
    }


    @Override
    public void deleteProduct(HttpServletRequest req, Long productId) {
        List<Long> bucket = (List<Long>) req.getSession().getAttribute("bucket");

        if (bucket != null){
            bucket.remove(productId);
        }
    }

    @Override
    public void cleanBucket(HttpServletRequest request) {
        ((List<Long>) request.getSession().getAttribute("bucket")).clear();
    }
}
