//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.06.03 às 01:18:45 PM BRT 
//
package br.inf.portalfiscal.nfe.v100.evento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the br.inf.portalfiscal.nfe package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Evento_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "evento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: br.inf.portalfiscal.nfe
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TRetEvento }
     *
     */
    public TRetEvento createTRetEvento() {
        return new TRetEvento();
    }

    /**
     * Create an instance of {@link TEvento }
     *
     */
    public TEvento createTEvento() {
        return new TEvento();
    }

    /**
     * Create an instance of {@link TEvento.InfEvento }
     *
     */
    public TEvento.InfEvento createTEventoInfEvento() {
        return new TEvento.InfEvento();
    }

    /**
     * Create an instance of {@link TRetEnvEvento }
     *
     */
    public TRetEnvEvento createTRetEnvEvento() {
        return new TRetEnvEvento();
    }

    /**
     * Create an instance of {@link TEnvEvento }
     *
     */
    public TEnvEvento createTEnvEvento() {
        return new TEnvEvento();
    }

    /**
     * Create an instance of {@link TProcEvento }
     *
     */
    public TProcEvento createTProcEvento() {
        return new TProcEvento();
    }

    /**
     * Create an instance of {@link TRetEvento.InfEvento }
     *
     */
    public TRetEvento.InfEvento createTRetEventoInfEvento() {
        return new TRetEvento.InfEvento();
    }

    /**
     * Create an instance of {@link TEvento.InfEvento.DetEvento }
     *
     */
    public TEvento.InfEvento.DetEvento createTEventoInfEventoDetEvento() {
        return new TEvento.InfEvento.DetEvento();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link TEvento }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "evento")
    public JAXBElement<TEvento> createEvento(TEvento value) {
        return new JAXBElement<TEvento>(_Evento_QNAME, TEvento.class, null, value);
    }

}
