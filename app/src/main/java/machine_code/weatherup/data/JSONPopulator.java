package machine_code.weatherup.data;

import org.json.JSONObject;

public interface JSONPopulator {
    void populate(JSONObject data);

    JSONObject toJSON();
}
