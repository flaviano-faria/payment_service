Basic project that demonstrate a usecase for strategy design pattern, so you don't need to use a big if/else strutucture


![strategy](https://github.com/flaviano-faria/payment_service/assets/67321021/852e924f-3691-40ea-a63b-09efa276289f)

---

## Project Overview

This project demonstrates how to use the Strategy Design Pattern to handle different payment methods in a clean and scalable way. Instead of relying on large if/else or switch statements to determine which payment logic to execute, the Strategy Pattern allows you to encapsulate each payment algorithm in its own class and select the appropriate one at runtime.

## Usage

- Clone the repository
- Install dependencies (if any)
- Run the project according to the instructions in the codebase

## Strategy Design Pattern in This Project

The Strategy Design Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. The pattern lets the algorithm vary independently from clients that use it.

**In this project:**
- There is a common interface (e.g., `PaymentStrategy`) that defines a method for processing payments.
- Each payment method (e.g., Credit Card, PayPal, Crypto) implements this interface with its own logic.
- The main payment service or context class receives a `PaymentStrategy` object and delegates the payment processing to it.
- This approach makes it easy to add new payment methods without modifying existing code, adhering to the Open/Closed Principle.

## Example (Pseudocode)

```python
class PaymentStrategy:
    def pay(self, amount):
        pass

class CreditCardPayment(PaymentStrategy):
    def pay(self, amount):
        # Credit card payment logic
        pass

class PayPalPayment(PaymentStrategy):
    def pay(self, amount):
        # PayPal payment logic
        pass

class PaymentService:
    def __init__(self, strategy: PaymentStrategy):
        self.strategy = strategy
    def process_payment(self, amount):
        self.strategy.pay(amount)
```

## Benefits
- Eliminates complex conditional logic
- Makes the codebase easier to extend and maintain
- Promotes separation of concerns and code reusability

---

Feel free to explore the code to see the Strategy Pattern in action!
