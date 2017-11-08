package com.wildbit.java.postmark.client.data.model.messages;

import java.util.ArrayList;

/**
 * Created by bash on 11/1/17.
 */
public class OutboundMessageDetails extends OutboundMessage {

    private String textBody;
    private String htmlBody;
    private String body;
    private ArrayList<OutboundMessageDetailsEvents> messageEvents;

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ArrayList<OutboundMessageDetailsEvents> getMessageEvents() {
        return messageEvents;
    }

    public void setMessageEvents(ArrayList<OutboundMessageDetailsEvents> messageEvents) {
        this.messageEvents = messageEvents;
    }
}
