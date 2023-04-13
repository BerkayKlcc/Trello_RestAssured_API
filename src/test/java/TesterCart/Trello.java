package TesterCart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trello {

    @SerializedName("board")
    @Expose
    private Integer board;
    @SerializedName("card")
    @Expose
    private Integer card;
}
