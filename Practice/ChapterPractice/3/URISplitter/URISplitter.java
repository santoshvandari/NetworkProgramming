import java.net.*;

class URISplitter{
    public static void main(String args[]){
        try{
            URI ui = new URI("https://www.google.com:80/search?q=reddis&sca_esv=9f96f96f072b035a&sxsrf=ADLYWIL_0UTreZurr9mFHR-kyy7_eK4oPw%3A1717926725468&source=hp&ei=RXtlZvfgGNPkseMP_bGo4A0&iflsig=AL9hbdgAAAAAZmWJVRlKMHMKbqfFXaIbfWBmJQHSma-R&ved=0ahUKEwi3l9_hn86GAxVTcmwGHf0YCtwQ4dUDCBU&uact=5&oq=reddis&gs_lp=Egdnd3Mtd2l6IgZyZWRkaXMyChAjGIAEGCcYigUyCxAAGIAEGJECGIoFMgsQABiABBiRAhiKBTIFEAAYgAQyCBAAGIAEGLEDMhEQLhiABBixAxjRAxiDARjHATIFEAAYgAQyBRAAGIAEMggQABiABBixAzIIEAAYgAQYsQNIjwdQAFjSBXAAeACQAQCYAfICoAGbB6oBBTItMi4xuAEDyAEA-AEBmAIDoAK0B8ICDhAuGIAEGLEDGIMBGIoFwgILEC4YgAQYsQMYgwHCAggQLhiABBixA8ICCxAAGIAEGLEDGIMBwgIFEC4YgATCAgQQIxgnwgILEAAYgAQYsQMYigWYAwCSBwUyLTEuMqAHxyM&sclient=gws-wiz");
            System.out.println(ui.isOpaque());
            System.out.println(ui.getPath()); 
            System.out.println(ui.getScheme()); 
            System.out.println(ui.getPort()); 
            System.out.println(ui.getFragment());
            System.out.println(ui.isAbsolute());
            System.out.println(ui.getUserInfo());
        }catch(Exception ex){
            System.out.println(ex);
        }

    }
}