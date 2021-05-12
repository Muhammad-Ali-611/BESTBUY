package BB;
import java.util.List;

public class DropDownPage extends HomePage {

    public void Account(){
        List<String> manulist = getListOfText("Menu");
        List<String> manu = getListOfText("hamburger-menu-flyout-list");
        for (String value: manulist){
            System.out.println(value);
        }

    }
}
