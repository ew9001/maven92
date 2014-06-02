package org.sonatype.mavenbook.createaccount;


import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

public class BrowserRetriever {

  private static Logger log = Logger.getLogger(BrowserRetriever.class);

  public InputStream retrieve(String zip) throws Exception {
    log.info( "Retrieving BrowserType" );
    String url = "http://weather.yahooapis.com/forecastrss?p=" + zip;
    URLConnection conn = new URL(url).openConnection();
    return conn.getInputStream();
  }
}
