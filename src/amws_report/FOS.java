package amws_report;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOS extends FileOutputStream
{

    private final StringBuilder string = new StringBuilder();

    public FOS(String name) throws FileNotFoundException
    {
        super(name);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        string.append(new String(b, off, len));
        Main.dosyayaYaz("off : " + off + " - len : " + len + " - b : " + b.length);
        Main.dosyayaYaz("string : " + string.length());

        super.write(b, off, len); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDosyaIcerigi()
    {
        return string.toString();
    }
}
