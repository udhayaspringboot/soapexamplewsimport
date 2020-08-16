
package com.aasoapexample;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aasoapexample package. 
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

    private final static QName _UpdateProductContResponse_QNAME = new QName("http://aasoapexample.com/", "updateProductContResponse");
    private final static QName _Product_QNAME = new QName("http://aasoapexample.com/", "Product");
    private final static QName _UpdateProductCont_QNAME = new QName("http://aasoapexample.com/", "updateProductCont");
    private final static QName _GetProductCont_QNAME = new QName("http://aasoapexample.com/", "getProductCont");
    private final static QName _GetAllProductContResponse_QNAME = new QName("http://aasoapexample.com/", "getAllProductContResponse");
    private final static QName _AddProductContResponse_QNAME = new QName("http://aasoapexample.com/", "addProductContResponse");
    private final static QName _DeleteProductCont_QNAME = new QName("http://aasoapexample.com/", "deleteProductCont");
    private final static QName _DeleteProductContResponse_QNAME = new QName("http://aasoapexample.com/", "deleteProductContResponse");
    private final static QName _AddProductCont_QNAME = new QName("http://aasoapexample.com/", "addProductCont");
    private final static QName _GetAllProductCont_QNAME = new QName("http://aasoapexample.com/", "getAllProductCont");
    private final static QName _GetProductContResponse_QNAME = new QName("http://aasoapexample.com/", "getProductContResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aasoapexample
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProductContResponse }
     * 
     */
    public AddProductContResponse createAddProductContResponse() {
        return new AddProductContResponse();
    }

    /**
     * Create an instance of {@link DeleteProductCont }
     * 
     */
    public DeleteProductCont createDeleteProductCont() {
        return new DeleteProductCont();
    }

    /**
     * Create an instance of {@link GetAllProductContResponse }
     * 
     */
    public GetAllProductContResponse createGetAllProductContResponse() {
        return new GetAllProductContResponse();
    }

    /**
     * Create an instance of {@link GetProductContResponse }
     * 
     */
    public GetProductContResponse createGetProductContResponse() {
        return new GetProductContResponse();
    }

    /**
     * Create an instance of {@link GetAllProductCont }
     * 
     */
    public GetAllProductCont createGetAllProductCont() {
        return new GetAllProductCont();
    }

    /**
     * Create an instance of {@link AddProductCont }
     * 
     */
    public AddProductCont createAddProductCont() {
        return new AddProductCont();
    }

    /**
     * Create an instance of {@link DeleteProductContResponse }
     * 
     */
    public DeleteProductContResponse createDeleteProductContResponse() {
        return new DeleteProductContResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link UpdateProductCont }
     * 
     */
    public UpdateProductCont createUpdateProductCont() {
        return new UpdateProductCont();
    }

    /**
     * Create an instance of {@link UpdateProductContResponse }
     * 
     */
    public UpdateProductContResponse createUpdateProductContResponse() {
        return new UpdateProductContResponse();
    }

    /**
     * Create an instance of {@link GetProductCont }
     * 
     */
    public GetProductCont createGetProductCont() {
        return new GetProductCont();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductContResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aasoapexample.com/", name = "updateProductContResponse")
    public JAXBElement<UpdateProductContResponse> createUpdateProductContResponse(UpdateProductContResponse value) {
        return new JAXBElement<UpdateProductContResponse>(_UpdateProductContResponse_QNAME, UpdateProductContResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aasoapexample.com/", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductCont }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aasoapexample.com/", name = "updateProductCont")
    public JAXBElement<UpdateProductCont> createUpdateProductCont(UpdateProductCont value) {
        return new JAXBElement<UpdateProductCont>(_UpdateProductCont_QNAME, UpdateProductCont.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCont }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aasoapexample.com/", name = "getProductCont")
    public JAXBElement<GetProductCont> createGetProductCont(GetProductCont value) {
        return new JAXBElement<GetProductCont>(_GetProductCont_QNAME, GetProductCont.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductContResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aasoapexample.com/", name = "getAllProductContResponse")
    public JAXBElement<GetAllProductContResponse> createGetAllProductContResponse(GetAllProductContResponse value) {
        return new JAXBElement<GetAllProductContResponse>(_GetAllProductContResponse_QNAME, GetAllProductContResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductContResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aasoapexample.com/", name = "addProductContResponse")
    public JAXBElement<AddProductContResponse> createAddProductContResponse(AddProductContResponse value) {
        return new JAXBElement<AddProductContResponse>(_AddProductContResponse_QNAME, AddProductContResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductCont }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aasoapexample.com/", name = "deleteProductCont")
    public JAXBElement<DeleteProductCont> createDeleteProductCont(DeleteProductCont value) {
        return new JAXBElement<DeleteProductCont>(_DeleteProductCont_QNAME, DeleteProductCont.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductContResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aasoapexample.com/", name = "deleteProductContResponse")
    public JAXBElement<DeleteProductContResponse> createDeleteProductContResponse(DeleteProductContResponse value) {
        return new JAXBElement<DeleteProductContResponse>(_DeleteProductContResponse_QNAME, DeleteProductContResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductCont }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aasoapexample.com/", name = "addProductCont")
    public JAXBElement<AddProductCont> createAddProductCont(AddProductCont value) {
        return new JAXBElement<AddProductCont>(_AddProductCont_QNAME, AddProductCont.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductCont }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aasoapexample.com/", name = "getAllProductCont")
    public JAXBElement<GetAllProductCont> createGetAllProductCont(GetAllProductCont value) {
        return new JAXBElement<GetAllProductCont>(_GetAllProductCont_QNAME, GetAllProductCont.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductContResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aasoapexample.com/", name = "getProductContResponse")
    public JAXBElement<GetProductContResponse> createGetProductContResponse(GetProductContResponse value) {
        return new JAXBElement<GetProductContResponse>(_GetProductContResponse_QNAME, GetProductContResponse.class, null, value);
    }

}
