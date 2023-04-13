package ListResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListResponse {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("idBoard")
    @Expose
    private String idBoard;
    @SerializedName("pos")
    @Expose
    private Integer pos;
    @SerializedName("status")
    @Expose
    private Object status;
    @SerializedName("limits")
    @Expose
    private Limits limits;
}
