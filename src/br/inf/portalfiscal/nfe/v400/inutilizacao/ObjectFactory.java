//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.06.03 às 01:02:07 PM BRT 
//


package br.inf.portalfiscal.nfe.v400.inutilizacao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.inf.portalfiscal.nfe package. 
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

    private final static QName _InutNFe_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "inutNFe");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.inf.portalfiscal.nfe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TRetInutNFe }
     * 
     */
    public TRetInutNFe createTRetInutNFe() {
        return new TRetInutNFe();
    }

    /**
     * Create an instance of {@link TInutNFe }
     * 
     */
    public TInutNFe createTInutNFe() {
        return new TInutNFe();
    }

    /**
     * Create an instance of {@link TProcInutNFe }
     * 
     */
    public TProcInutNFe createTProcInutNFe() {
        return new TProcInutNFe();
    }

    /**
     * Create an instance of {@link TRetInutNFe.InfInut }
     * 
     */
    public TRetInutNFe.InfInut createTRetInutNFeInfInut() {
        return new TRetInutNFe.InfInut();
    }

    /**
     * Create an instance of {@link TInutNFe.InfInut }
     * 
     */
    public TInutNFe.InfInut createTInutNFeInfInut() {
        return new TInutNFe.InfInut();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TInutNFe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "inutNFe")
    public JAXBElement<TInutNFe> createInutNFe(TInutNFe value) {
        return new JAXBElement<TInutNFe>(_InutNFe_QNAME, TInutNFe.class, null, value);
    }

}
