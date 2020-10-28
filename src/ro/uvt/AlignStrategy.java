package ro.uvt;

import javax.naming.Context;

public interface AlignStrategy {
    void render(Paragraph p, Context c);
    void setAlignment(Paragraph p, Context c);

}
