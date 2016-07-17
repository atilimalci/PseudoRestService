package com.rs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {

   private int responseCode;
   private String message;

   public Response() {
	   super();
   }

   public Response(int responseCode, String response) {
      super();
      this.responseCode = responseCode;
      this.message = response;
   }

   public int getResponseCode() {
      return responseCode;
   }

   public void setResponseCode(int responseCode) {
      this.responseCode = responseCode;
   }

   public String getResponse() {
      return message;
   }

   public void setResponse(String response) {
      this.message = response;
   }


}
