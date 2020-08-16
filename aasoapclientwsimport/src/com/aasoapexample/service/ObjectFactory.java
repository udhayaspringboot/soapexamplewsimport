
package com.aasoapexample.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aasoapexample.service package. 
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

    private final static QName _AddProductServResponse_QNAME = new QName("http://service.aasoapexample.com/", "addProductServResponse");
    private final static QName _Product_QNAME = new QName("http://service.aasoapexample.com/", "Product");
    private final static QName _AddProductServ_QNAME = new QName("http://service.aasoapexample.com/", "addProductServ");
    private final static QName _GetAllProductServResponse_QNAME = new QName("http://service.aasoapexample.com/", "getAllProductServResponse");
    private final static QName _DeleteProductServ_QNAME = new QName("http://service.aasoapexample.com/", "deleteProductServ");
    private final static QName _UpdateProductServ_QNAME = new QName("http://service.aasoapexample.com/", "updateProductServ");
    private final static QName _GetProductServ_QNAME = new QName("http://service.aasoapexample.com/", "getProductServ");
    private final static QName _GetProductServResponse_QNAME = new QName("http://service.aasoapexample.com/", "getProductServResponse");
    private final static QName _DeleteProductServResponse_QNAME = new QName("http://service.aasoapexample.com/", "deleteProductServResponse");
    private final static QName _UpdateProductServResponse_QNAME = new QName("http://service.aasoapexample.com/", "updateProductServResponse");
    private final static QName _GetAllProductServ_QNAME = new QName("http://service.aasoapexample.com/", "getAllProductServ");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aasoapexample.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllProductServ }
     * 
     */
    public GetAllProductServ createGetAllProductServ() {
        return new GetAllProductServ();
    }

    /**
     * Create an instance of {@link DeleteProductServResponse }
     * 
     */
    public DeleteProductServResponse createDeleteProductServResponse() {
        return new DeleteProductServResponse();
    }

    /**
     * Create an instance of {@link UpdateProductServResponse }
     * 
     */
    public UpdateProductServResponse createUpdateProductServResponse() {
        return new UpdateProductServResponse();
    }

    /**
     * Create an instance of {@link GetProductServ }
     * 
     */
    public GetProductServ createGetProductServ() {
        return new GetProductServ();
    }

    /**
     * Create an instance of {@link GetProductServResponse }
     * 
     */
    public GetProductServResponse createGetProductServResponse() {
        return new GetProductServResponse();
    }

    /**
     * Create an instance of {@link DeleteProductServ }
     * 
     */
    public DeleteProductServ createDeleteProductServ() {
        return new DeleteProductServ();
    }

    /**
     * Create an instance of {@link UpdateProductServ }
     * 
     */
    public UpdateProductServ createUpdateProductServ() {
        return new UpdateProductServ();
    }

    /**
     * Create an instance of {@link GetAllProductServResponse }
     * 
     */
    public GetAllProductServResponse createGetAllProductServResponse() {
        return new GetAllProductServResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link AddProductServ }
     * 
     */
    public AddProductServ createAddProductServ() {
        return new AddProductServ();
    }

    /**
     * Create an instance of {@link AddProductServResponse }
     * 
     */
    public AddProductServResponse createAddProductServResponse() {
        return new AddProductServResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductServResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.aasoapexample.com/", name = "addProductServResponse")
    public JAXBElement<AddProductServResponse> createAddProductServResponse(AddProductServResponse value) {
        return new JAXBElement<AddProductServResponse>(_AddProductServResponse_QNAME, AddProductServResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.aasoapexample.com/", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductServ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.aasoapexample.com/", name = "addProductServ")
    public JAXBElement<AddProductServ> createAddProductServ(AddProductServ value) {
        return new JAXBElement<AddProductServ>(_AddProductServ_QNAME, AddProductServ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductServResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.aasoapexample.com/", name = "getAllProductServResponse")
    public JAXBElement<GetAllProductServResponse> createGetAllProductServResponse(GetAllProductServResponse value) {
        return new JAXBElement<GetAllProductServResponse>(_GetAllProductServResponse_QNAME, GetAllProductServResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductServ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.aasoapexample.com/", name = "deleteProductServ")
    public JAXBElement<DeleteProductServ> createDeleteProductServ(DeleteProductServ value) {
        return new JAXBElement<DeleteProductServ>(_DeleteProductServ_QNAME, DeleteProductServ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductServ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.aasoapexample.com/", name = "updateProductServ")
    public JAXBElement<UpdateProductServ> createUpdateProductServ(UpdateProductServ value) {
        return new JAXBElement<UpdateProductServ>(_UpdateProductServ_QNAME, UpdateProductServ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductServ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.aasoapexample.com/", name = "getProductServ")
    public JAXBElement<GetProductServ> createGetProductServ(GetProductServ value) {
        return new JAXBElement<GetProductServ>(_GetProductServ_QNAME, GetProductServ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductServResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.aasoapexample.com/", name = "getProductServResponse")
    public JAXBElement<GetProductServResponse> createGetProductServResponse(GetProductServResponse value) {
        return new JAXBElement<GetProductServResponse>(_GetProductServResponse_QNAME, GetProductServResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductServResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.aasoapexample.com/", name = "deleteProductServResponse")
    public JAXBElement<DeleteProductServResponse> createDeleteProductServResponse(DeleteProductServResponse value) {
        return new JAXBElement<DeleteProductServResponse>(_DeleteProductServResponse_QNAME, DeleteProductServResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductServResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.aasoapexample.com/", name = "updateProductServResponse")
    public JAXBElement<UpdateProductServResponse> createUpdateProductServResponse(UpdateProductServResponse value) {
        return new JAXBElement<UpdateProductServResponse>(_UpdateProductServResponse_QNAME, UpdateProductServResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductServ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.aasoapexample.com/", name = "getAllProductServ")
    public JAXBElement<GetAllProductServ> createGetAllProductServ(GetAllProductServ value) {
        return new JAXBElement<GetAllProductServ>(_GetAllProductServ_QNAME, GetAllProductServ.class, null, value);
    }

}
