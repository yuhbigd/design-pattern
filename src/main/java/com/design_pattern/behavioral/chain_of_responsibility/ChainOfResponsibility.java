package com.design_pattern.behavioral.chain_of_responsibility;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        // Create Approvers
        Approver juniorApprover = new JuniorApprover();
        Approver seniorApprover = new SeniorApprover();
        Approver managerApprover = new ManagerApprover();

        // Set up the chain of responsibility
        juniorApprover.setSuccessor(seniorApprover);
        seniorApprover.setSuccessor(managerApprover);

        // Create Purchase Requests
        PurchaseRequest request1 = new PurchaseRequest("Office Supplies", 500);
        PurchaseRequest request2 = new PurchaseRequest("Conference Room Chairs", 2500);
        PurchaseRequest request3 = new PurchaseRequest("New Laptop", 12000);

        // Process Purchase Requests
        juniorApprover.processRequest(request1);
        juniorApprover.processRequest(request2);
        juniorApprover.processRequest(request3);
    }
}
