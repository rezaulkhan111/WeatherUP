package machine_code.weatherup.listener;

import machine_code.weatherup.data.Channel;

public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
