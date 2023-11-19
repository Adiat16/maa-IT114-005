package Project.common;

import java.io.Serializable;

public class Payload implements Serializable { // UCID: maa, Date: 11/13/23, Milestone 2
    // read https://www.baeldung.com/java-serial-version-uid
    private static final long serialVersionUID = 1L; // change this if the class changes

    /**
     * Determines how to process the data on the receiver's side.
     * This property defines the type of payload, indicating the purpose or action to be performed.
     */

     // UCID: maa, Date: 11/13/23, Milestone 2

    private PayloadType payloadType;

    public PayloadType getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(PayloadType payloadType) {
        this.payloadType = payloadType;
    }

    /**
     * Represents the name of the client who sent the payload (Who the payload is from)
     * It indicates the source of the payload.
     */

     // UCID: maa, Date: 11/13/23, Milestone 2

    private String clientName;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Represents the unique identifier of the client who sent the payload.
     * It uniquely identifies the source client.
     */

     // UCID: maa, Date: 11/13/23, Milestone 2

    private long clientId;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    /**
     * Represents the generic text-based message included in the payload.
     * It carries the main content or information of the payload.
     */

     // UCID: maa, Date: 11/13/23, Milestone 2

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("Type[%s],ClientId[%s,] ClientName[%s], Message[%s]", getPayloadType().toString(),
                getClientId(), getClientName(),
                getMessage());
    }
} // UCID: maa, Date: 11/13/23, Milestone 2