package APIConverter;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig(Retrofit retrofit){

        this.retrofit = new Retrofit.Builder()
                            .baseUrl("https://blockchain.info/ticker")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
    }

    public MOEDAService getMOEDAService(){
        return this.retrofit.create(MOEDAService.class);
    }
}
