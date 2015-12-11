package nyc.c4q.android.model;

import java.io.Serializable;
import java.util.Date;

public class Email implements Serializable {
  private static final long serialVersionUID = -6099312954099962806L;

  private String from;
  private String fromUrl;
  private String subject;
  private String body;
  private Date sent;

  public Email(String from, String fromUrl, String subject, String body, Date sent) {
    this.from = from;
    this.fromUrl = fromUrl;
    this.subject = subject;
    this.body = body;
    this.sent = sent;
  }

  @Override public String toString() {
    return subject;
  }

  public String getFrom() {
    return from;
  }

  public String getFromUrl() {
    return fromUrl;
  }

  public String getSubject() {
    return subject;
  }

  public String getBody() {
    return body;
  }

  public Date getSent() {
    return sent;
  }

}