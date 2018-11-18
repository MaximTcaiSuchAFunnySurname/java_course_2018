package codewars;

public class Dictionary {
    String key, value;

    public void newEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String look(String key) {
        if (this.key == key) return value;
        else return "Cant find entry for " + key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
//    String key;
//    String value;
//    public void newEntry(String key, String value){
//        this.key = key;
//        this.value = value;
//    }
//
//    public String look(String key){
//        return value;
//    }

