package Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AttachmentsByType {
    @SerializedName("trello")
    @Expose
    private Trello trello;
}
