package pl.sda.service;

import pl.sda.dao.ProductDao;
import pl.sda.dao.ProductDaoImpl;
import pl.sda.dao.ProductImageDao;
import pl.sda.dao.ProductImageDaoImpl;
import pl.sda.entity.ProductEntity;
import pl.sda.model.Product;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static pl.sda.mapper.ProductMapper.mapToProduct;

public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao = new ProductDaoImpl();

    private final ProductImageDao productImageDao = new ProductImageDaoImpl();

    @Override
    public List<Product> getProducts() {
        return productDao.getProducts().stream().map(
                p -> mapToProduct(p, productImageDao.getImagePathForProduct(p.getId()))).collect(toList());
    }

    @Override
    public Product getProduct(long id) {
        ProductEntity product = productDao.getProduct(id).orElse(null);
        String imagePathForProduct = productImageDao.getImagePathForProduct(id);
        return mapToProduct(product, imagePathForProduct);
    }
}
