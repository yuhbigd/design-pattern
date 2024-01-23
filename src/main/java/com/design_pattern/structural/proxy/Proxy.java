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


// Proxy class. Lazy loading subject
class Proxy implements RealSubject {
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

    public static void main(String[] args) {
        // Using the RealSubject directly
        RealSubject realSubject = new RealSubjectImpl();
        realSubject.request();

        System.out.println("------------------------");

        // Using the Proxy to control access to the RealSubject
        Proxy proxy = new Proxy();
        proxy.request();
    }
}


