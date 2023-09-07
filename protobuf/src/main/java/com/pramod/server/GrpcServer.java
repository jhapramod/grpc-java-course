package com.pramod.server;

import com.google.maps.errors.ApiException;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException, ApiException {
        Server server = ServerBuilder.forPort(6565)
                .addService(new BankService())
                .addService(new TransferService())
                .build();

        server.start();
        System.out.println("GCP Server started...");
        server.awaitTermination();
        System.out.println("GCP Server terminated....");





        /*GeoApiContext context = new GeoApiContext.Builder()
                .apiKey("AIzaSyBzEdKaqRwpGq-fVEg_9UpBVhlE63RzM5o")
                .build();

        for (int i = 0; i < 10; i++) {

            GeocodingResult[] geocodingResults = GeocodingApi.geocode(context, "1600 Amphitheatre Parkway Mountain View, CA 94043")
                    .await();
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//            System.out.println(gson.toJson(geocodingResults[0].addressComponents));
        }

// Invoke .shutdown() after your application is done making requests
        context.shutdown();*/
    }


}
