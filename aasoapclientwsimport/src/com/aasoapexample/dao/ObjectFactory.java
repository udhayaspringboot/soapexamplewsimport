
package com.aasoapexample.dao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aasoapexample.dao package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddProduct_QNAME = new QName("http://dao.aasoapexample.com/", "addProduct");
    private final static QName _UpdateProduct_QNAME = new QName("http://dao.aasoapexample.com/", "updateProduct");
    private final static QName _DeleteProductResponse_QNAME = new QName("http://dao.aasoapexample.com/", "deleteProductResponse");
    private final static QName _GetProduct_QNAME = new QName("http://dao.aasoapexample.com/", "getProduct");
    private final static QName _GetProductResponse_QNAME = new QName("http://dao.aasoapexample.com/", "getProductResponse");
    private final static QName _UpdateProductResponse_QNAME = new QName("http://dao.aasoapexample.com/", "updateProductResponse");
    private final static QName _GetAllProduct_QNAME = new QName("http://dao.aasoapexample.com/", "getAllProduct");
    private final static QName _DeleteProduct_QNAME = new QName("http://dao.aasoapexample.com/", "deleteProduct");
    private final static QName _AddProductResponse_QNAME = new QName("http://dao.aasoapexample.com/", "addProductResponse");
    private final static QName _GetAllProductResponse_QNAME = new QName("http://dao.aasoapexample.com/", "getAllProductResponse");
    private final static QName _Product_QNAME = new QName("http://dao.aasoapexample.com/", "Product");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aasoapexample.dao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link UpdateProduct }
     * 
     */
    public UpdateProduct createUpdateProduct() {
        return new UpdateProduct();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetAllProductResponse }
     * 
     */
    public GetAllProductResponse createGetAllProductResponse() {
        return new GetAllProductResponse();
    }

    /**
     * Create an instance of {@link GetAllProduct }
     * 
     */
    public GetAllProduct createGetAllProduct() {
        return new GetAllProduct();
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link UpdateProductResponse }
     * 
     */
    public UpdateProductResponse createUpdateProductResponse() {
        return new UpdateProductResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.aasoapexample.com/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.aasoapexample.com/", name = "updateProduct")
    public JAXBElement<UpdateProduct> createUpdateProduct(UpdateProduct value) {
        return new JAXBElement<UpdateProduct>(_UpdateProduct_QNAME, UpdateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.aasoapexample.com/", name = "deleteProductResponse")
    public JAXBElement<DeleteProductResponse> createDeleteProductResponse(DeleteProductResponse value) {
        return new JAXBElement<DeleteProductResponse>(_DeleteProductResponse_QNAME, DeleteProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.aasoapexample.com/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<GetProduct>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.aasoapexample.com/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<GetProductResponse>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.aasoapexample.com/", name = "updateProductResponse")
    public JAXBElement<UpdateProductResponse> createUpdateProductResponse(UpdateProductResponse value) {
        return new JAXBElement<UpdateProductResponse>(_UpdateProductResponse_QNAME, UpdateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.aasoapexample.com/", name = "getAllProduct")
    public JAXBElement<GetAllProduct> createGetAllProduct(GetAllProduct value) {
        return new JAXBElement<GetAllProduct>(_GetAllProduct_QNAME, GetAllProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.aasoapexample.com/", name = "deleteProduct")
    public JAXBElement<DeleteProduct> createDeleteProduct(DeleteProduct value) {
        return new JAXBElement<DeleteProduct>(_DeleteProduct_QNAME, DeleteProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.aasoapexample.com/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.aasoapexample.com/", name = "getAllProductResponse")
    public JAXBElement<GetAllProductResponse> createGetAllProductResponse(GetAllProductResponse value) {
        return new JAXBElement<GetAllProductResponse>(_GetAllProductResponse_QNAME, GetAllProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.aasoapexample.com/", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

}
