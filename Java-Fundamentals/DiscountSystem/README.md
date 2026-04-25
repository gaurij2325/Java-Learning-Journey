# 🏷️ Discount System (Java)

## 📌 Description
This is a console-based Discount System built using Java.  
It calculates the final payable amount for a customer based on multiple conditions such as purchase amount, membership status, and festive offers.

The system simulates real-world discount logic and categorizes customers accordingly.

---

## 🚀 Features
- 💰 Calculates discount based on purchase amount
- 🎉 Additional discount for festive season
- 👤 Extra discount for members
- ⚠️ Maximum discount capped at 30%
- 🧾 Displays final payable amount
- 🏷️ Classifies customer type (Basic / Regular / Premium)
- 🔁 Supports repeated execution using loop

---

## 🧠 Discount Logic

### Base Discount (based on purchase amount):
- ₹5000 and above → 20%
- ₹2000 to ₹4999 → 10%
- Below ₹2000 → 5%

### Additional Discounts:
- Festive season → +10%
- Membership → +5%

### Maximum Discount:
- Total discount is capped at **30%**

---

## 🧠 Concepts Used
- Conditional statements (if-else)
- Ternary operator
- Loops (do-while)
- User input using Scanner
- Variables and arithmetic operations

---

## 🎯 Learning Outcome
- Learned how to implement multi-condition business logic
- Practiced combining multiple conditions effectively
- Understood how to cap values (maximum discount logic)
- Improved handling of real-world scenarios in code

---

## 🚀 Future Improvements
- Add input validation (negative amounts, invalid inputs)
- Convert system into OOP-based design
- Store transaction history
- Add GUI for better user interaction

---

## ▶️ How to Run

1. Compile the program:
   ```bash
   javac DiscountSystem.java

2. Run the program:
   ```bash
   java DiscountSystem
