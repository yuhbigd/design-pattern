package com.design_pattern.structural.proxy;

interface RealSubject {
    void request();
}


// RealSubject class
class RealSubjectImpl implements RealSubject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}


class LazyLoadingSubject implements RealSubject {
    private RealSubject realSubject;

    @Override
    public void request() {
        // Lazy initialization: Create the RealSubject only when necessary
        if (realSubject == null) {
            realSubject = new RealSubjectImpl();
        }

        // Additional logic before or after forwarding the request to the RealSubject
        System.out.println("Proxy: Performing some additional logic before calling RealSubject.");

        // Forward the request to the RealSubject
        realSubject.request();

        // Additional logic after forwarding the request to the RealSubject
        System.out.println("Proxy: Performing some additional logic after calling RealSubject.");
    }
}


class Proxy {


    public static void main(String[] args) {
        RealSubject realSubject = new RealSubjectImpl();
        realSubject.request();

        System.out.println("------------------------");

        LazyLoadingSubject proxy = new LazyLoadingSubject();
        proxy.request();
    }
}


