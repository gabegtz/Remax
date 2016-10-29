import java.sql.Date;

/**
 * Created by Gabriel Gutierrez on 10/29/2016.
 */
public class Agent {
    private String f_name;
    private String l_name;
    private Date h_date;
    private String username;

    public Agent(String f_name, String l_name, Date h_date, String username) {
        f_name = this.f_name;
        l_name = this.l_name;
        h_date = this.h_date;
        username = this.username;
    }

    private void addToDatabase(){


    }
}

