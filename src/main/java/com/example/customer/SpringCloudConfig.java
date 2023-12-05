//package com.example.customer;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SpringCloudConfig {
//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder)
//    {
//        return routeLocatorBuilder
//                .routes()
//                .route(r->r.path("/doctor/**")
//                        .uri("http://localhost:8080/")
//                         )
//                .route(r->r.path("patient/**")
//                        .uri("http://localhost:8081/")
//                        )
//                .build();
//
//    }
//}
