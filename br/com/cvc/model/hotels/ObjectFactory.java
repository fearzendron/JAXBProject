//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.01 at 01:12:49 AM BRT 
//


package br.com.cvc.model.hotels;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.cvc.model.hotels package. 
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

    private final static QName _Room_QNAME = new QName("http://cvc.com.br/model/hotels", "room");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.cvc.model.hotels
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link HotelType }
     * 
     */
    public HotelType createHotelType() {
        return new HotelType();
    }

    /**
     * Create an instance of {@link HotelRoomType }
     * 
     */
    public HotelRoomType createHotelRoomType() {
        return new HotelRoomType();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link LoyaltyPoints }
     * 
     */
    public LoyaltyPoints createLoyaltyPoints() {
        return new LoyaltyPoints();
    }

    /**
     * Create an instance of {@link HotelLinks }
     * 
     */
    public HotelLinks createHotelLinks() {
        return new HotelLinks();
    }

    /**
     * Create an instance of {@link Cancellation }
     * 
     */
    public Cancellation createCancellation() {
        return new Cancellation();
    }

    /**
     * Create an instance of {@link HotelsRoomMeta }
     * 
     */
    public HotelsRoomMeta createHotelsRoomMeta() {
        return new HotelsRoomMeta();
    }

    /**
     * Create an instance of {@link CancellationPolicy }
     * 
     */
    public CancellationPolicy createCancellationPolicy() {
        return new CancellationPolicy();
    }

    /**
     * Create an instance of {@link HotelMeta }
     * 
     */
    public HotelMeta createHotelMeta() {
        return new HotelMeta();
    }

    /**
     * Create an instance of {@link Player }
     * 
     */
    public Player createPlayer() {
        return new Player();
    }

    /**
     * Create an instance of {@link ChannelManager }
     * 
     */
    public ChannelManager createChannelManager() {
        return new ChannelManager();
    }

    /**
     * Create an instance of {@link Creation }
     * 
     */
    public Creation createCreation() {
        return new Creation();
    }

    /**
     * Create an instance of {@link Rate }
     * 
     */
    public Rate createRate() {
        return new Rate();
    }

    /**
     * Create an instance of {@link Coordinates }
     * 
     */
    public Coordinates createCoordinates() {
        return new Coordinates();
    }

    /**
     * Create an instance of {@link HotelStay }
     * 
     */
    public HotelStay createHotelStay() {
        return new HotelStay();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link PreviousReservation }
     * 
     */
    public PreviousReservation createPreviousReservation() {
        return new PreviousReservation();
    }

    /**
     * Create an instance of {@link Loyalty }
     * 
     */
    public Loyalty createLoyalty() {
        return new Loyalty();
    }

    /**
     * Create an instance of {@link ReservationMeta }
     * 
     */
    public ReservationMeta createReservationMeta() {
        return new ReservationMeta();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link ContentItem }
     * 
     */
    public ContentItem createContentItem() {
        return new ContentItem();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Room }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cvc.com.br/model/hotels", name = "room")
    public JAXBElement<Room> createRoom(Room value) {
        return new JAXBElement<Room>(_Room_QNAME, Room.class, null, value);
    }

}
