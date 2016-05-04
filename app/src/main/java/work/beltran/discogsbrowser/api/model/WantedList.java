package work.beltran.discogsbrowser.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Miquel Beltran on 04.05.16.
 * More on http://beltran.work
 */
public class WantedList  implements RecordsResult {
    @SerializedName("pagination")
    private Pagination pagination;
    @SerializedName("wants")
    private List<Record> records;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
