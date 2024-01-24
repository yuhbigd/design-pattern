package com.design_pattern.behavioral.chain_of_responsibility;

public interface Approver {
    void setSuccessor(Approver successor);

    void processRequest(PurchaseRequest request);
}


// Concrete handler 1 - Junior Approver
class JuniorApprover implements Approver {
    private Approver successor;
    private double approvalLimit = 1000;

    @Override
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= approvalLimit) {
            System.out.println("Junior Approver approves purchase: " + request.getDescription());
        } else if (successor != null) {
            successor.processRequest(request);
        } else {
            System.out.println("Purchase request cannot be approved.");
        }
    }
}


// Concrete handler 2 - Senior Approver
class SeniorApprover implements Approver {
    private Approver successor;
    private double approvalLimit = 5000;

    @Override
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= approvalLimit) {
            System.out.println("Senior Approver approves purchase: " + request.getDescription());
        } else if (successor != null) {
            successor.processRequest(request);
        } else {
            System.out.println("Purchase request cannot be approved.");
        }
    }
}


// Concrete handler 3 - Manager Approver
class ManagerApprover implements Approver {
    private Approver successor;
    private double approvalLimit = 10000;

    @Override
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= approvalLimit) {
            System.out.println("Manager Approver approves purchase: " + request.getDescription());
        } else if (successor != null) {
            successor.processRequest(request);
        } else {
            System.out.println("Purchase request cannot be approved.");
        }
    }
}
