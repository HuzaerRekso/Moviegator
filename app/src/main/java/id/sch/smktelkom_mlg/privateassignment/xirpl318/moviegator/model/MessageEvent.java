package id.sch.smktelkom_mlg.privateassignment.xirpl318.moviegator.model;

/**
 * Created by MHRJ on 5/19/2017.
 */

public class MessageEvent {
    private boolean update = false;

    public MessageEvent(boolean update) {
        this.update = update;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }
}
