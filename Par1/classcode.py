class Κατάστημα:
    def __init__(self, address, storeID, minishopID, paymentID):
        self.address = address
        self.storeID = storeID
        self.minishopID = minishopID
        self.paymentID = paymentID

    def updateCalendar(self):
        # Method logic for updating calendar
        print("Calendar updated successfully.")

    def payment(self):
        # Method logic for processing payment
        print("Payment processed successfully.")

    def cancelation(self):
        # Method logic for cancellation
        print("Cancellation processed successfully.")





class Χρήστης:
    def __init__(self, customerID, username, name, surname, city, phone, email):
        self.customerID = customerID
        self.username = username
        self.name = name
        self.surname = surname
        self.city = city
        self.phone = phone
        self.email = email

    def update_info(self):
        # Method logic for updating user information
        print("User information updated successfully.")

    def user_token(self):
        # Method logic for generating user token
        # You can implement the logic for generating user token here
        print("User token generated successfully.")








class Συνδρομή:
    def __init__(self, paymentID, storeID, date, subscriptionplan):
        self.paymentID = paymentID
        self.storeID = storeID
        self.date = date
        self.subscriptionplan = subscriptionplan

    def changeplan(self):
        # Method logic for changing subscription plan
        print("Subscription plan changed successfully.")

    def cancelplan(self):
        # Method logic for canceling subscription plan
        print("Subscription plan canceled successfully.")








        from enum import Enum

class Specialties(Enum):
    SPECIALTY1 = "Specialty1"
    SPECIALTY2 = "Specialty2"
    SPECIALTY3 = "Specialty3"

class Υπάληλοι:
    def __init__(self, workerID, phone, email, name, surname, specialties):
        self.workerID = workerID
        self.phone = phone
        self.email = email
        self.name = name
        self.surname = surname
        self.specialties = specialties

    def updateCalendar(self):
        # Method logic for updating employee's calendar
        print("Employee's calendar updated successfully.")









        class Ωράριο:
    def __init__(self, storeID, date_time):
        self.storeID = storeID
        self.date_time = date_time

    def updateCalendar(self):
        # Method logic for updating schedule/calendar
        print("Schedule/calendar updated successfully.")









        from enum import Enum

class ProductCategories(Enum):
    CATEGORY1 = "Category1"
    CATEGORY2 = "Category2"
    CATEGORY3 = "Category3"

class Minishop:
    def __init__(self, minishopID, product_categories, products, productID, price):
        self.minishopID = minishopID
        self.product_categories = product_categories
        self.products = products
        self.productID = productID
        self.price = price

    def product_reservation(self):
        # Method logic for product reservation
        print("Product reserved successfully.")

    def updateproduct(self):
        # Method logic for updating product information
        print("Product information updated successfully.")






class Ωράριο_Υπαλλήλων:
    def __init__(self, date_time, workerID):
        self.date_time = date_time
        self.workerID = workerID

    def updateCalendar(self):
        # Method logic for updating employee schedule/calendar
        print("Employee schedule/calendar updated successfully.")








class Προφίλ:
    def __init__(self, customerID, storeID, bio_text, profil_photo):
        self.customerID = customerID
        self.storeID = storeID
        self.bio_text = bio_text
        self.profil_photo = profil_photo

    def updateBio(self):
        # Method logic for updating bio
        print("Bio updated successfully.")











        class Πελάτης:
    def __init__(self, customerID):
        self.customerID = customerID

    def updatedate(self):
        # Method logic for updating date
        print("Date updated successfully.")

    def canceldate(self):
        # Method logic for canceling date
        print("Date canceled successfully.")





        class Κράτηση:
    def __init__(self, reservationID, storeID, date):
        self.reservationID = reservationID
        self.storeID = storeID
        self.date = date

    def updateCalendar(self):
        # Method logic for updating calendar
        print("Calendar updated successfully.")

    def notifyStore(self):
        # Method logic for notifying the store
        print("Store notified about reservation.")





        class Κράτηση_ραντεβού:
    def __init__(self, storeID, date, reservationID, customerID):
        self.storeID = storeID
        self.date = date
        self.reservationID = reservationID
        self.customerID = customerID

    def updateCalendar(self):
        # Method logic for updating calendar
        print("Calendar updated successfully.")

    def notifyStore(self):
        # Method logic for notifying the store
        print("Store notified about reservation.")

    def userconfirmation(self):
        # Method logic for user confirmation
        print("User confirmed the reservation.")







        from enum import Enum

class Favourites(Enum):
    FAVOURITE1 = "Favourite1"
    FAVOURITE2 = "Favourite2"
    FAVOURITE3 = "Favourite3"

class Αγαπημένα:
    def __init__(self, storeID, customerID, favourites):
        self.storeID = storeID
        self.customerID = customerID
        self.favourites = favourites

    def updateFavourites(self):
        # Method logic for updating favorites
        print("Favorites updated successfully.")










        from enum import Enum

class ReviewGrade(Enum):
    EXCELLENT = "Excellent"
    GOOD = "Good"
    AVERAGE = "Average"
    POOR = "Poor"

class Αξιολόγηση:
    def __init__(self, storeID, customerID, reviewgrade, reviewtext):
        self.storeID = storeID
        self.customerID = customerID
        self.reviewgrade = reviewgrade
        self.reviewtext = reviewtext

    def uploadreview(self):
        # Method logic for uploading review
        print("Review uploaded successfully.")

    def updatereview(self):
        # Method logic for updating review
        print("Review updated successfully.")








        class Κράτηση_προϊόντων:
    def __init__(self, minishopID, productID, storeID):
        self.minishopID = minishopID
        self.productID = productID
        self.storeID = storeID

    def addtoCart(self):
        # Method logic for adding to cart
        print("Product added to cart.")

    def notifyStore(self):
        # Method logic for notifying the store
        print("Store notified about product reservation.")
















