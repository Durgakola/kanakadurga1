package restarent;

import java.util.List;

public class Restarent {
    public List<RestarentDetails> restarentDetails;

    public List<Dishes> deeshesList;

    @Override
    public String toString() {
        return "Restarent{" +
                "restarentDetails=" + restarentDetails +
                ", deeshesList=" + deeshesList +
                '}';
    }
}
