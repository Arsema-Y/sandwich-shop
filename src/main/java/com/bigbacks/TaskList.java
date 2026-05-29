package com.bigbacks;

import java.util.List;

public record TaskList() {
    /*TASK-LIST-1
    ARCHITECTURE ===============================
    - packages ☑️
    - classes ☑️
    - guide comment ️️☑️

    MODEL ==============================
    - Interface ☑️
    - Abstract ☑️
    - Heirs
      - Sandwich ------------------
        = fields ☑️
        = methods ☑️
      - Sides ------------------
        = fields ☑️
        = methods ☑️
      - Drinks ------------------ morning
        = fields ☑️
        = methods ☑️
      - Orders ------------------
        = fields ☑️
        = methods ☑️
------------- REBRANDing ----------------
    UI =================================
    - Menu
        = fields
        = methods
          - screen-1 ------------------ afternoon
          - screen-2 ------------------
          - screen-3 ------------------
          - screen-4 ------------------
          - screen-5 ------------------
          - screen-6 ------------------

           ~ ☑️skeletal = 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 + 9
           ~ ☑️field = 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 + 9
           ~ body = ☑️1 - ☑️2 - ☑️3 - ☑️4 - ☑️5 - ️️☑️6 - ☑️7 - ☑️8 + 9
           ~ switch statements = ☑️1 - ☑️2 - ☑️3 - ☑️4 - ☑️5 - ☑️6 - ☑️7 - ☑️8 + 9

        = Edits


    DATA ============================
    - OrderHistory
        = method
        = exception


    APP ===========================
    - main method

    README ========================
     */

    /*TASK-LIST-2

ARCHITECTURE ===============================
- packages ☑️
- classes ☑️
- guide comment ☑️

MODEL (com.pluralsight.deli.models) ========
- ☑️Interface (ItemPrice) ️
    = method: double getPrice() ️️️
- ☑️Abstract Class (MenuItem implements ItemPrice)
    = fields:️
     - String name,
     - String size
    = constructor & getters
- Heirs
  - ☑️Sandwich ------------------
    = fields:️
     - List<String> meats,
     - List<String> cheeses,
     - List<String> regularToppings,
     - List<String> sauces
    = fields:
     - boolean isExtraMeat,
     - boolean isExtraCheese,
     - boolean isToasted
    = methods:
     - addMeat(),
     - addCheese(),
     - addSauce(), etc.
    = method override:
     - getPrice() (Calculates base by size + progressive meat/cheese premiums)

  - ☑️AddOns ------------------
    = fields:
     - String type (e.g., potato salad, chips)
    = method override:
     - getPrice() (Flat rate based on size)

  - ☑️Drinks ------------------
    = fields:
     - String flavor
    = method override:
     - getPrice() (Flat rate based on size)

  - ☑️Orders ------------------
    = fields:
     - List<MenuItem> orderItems
    = methods:
     - addItem(),
     - removeItem()
    = method:
     - double calculateOrderTotal() (Loops/Streams through orderItems calling getPrice())

  - ☑️SignatureSandwiches
   = fields
    - choice
   = method
    - constructor()
    - makeSandwiches()

UI (com.pluralsight.deli.ui) ===============
- Menu / UserInterface Class
    = fields: Scanner scanner, Order currentOrder
    = methods:
      - displayHomeScreen()      -------------- (
        1: New Order,
        0: Exit)

      - displayOrderScreen()     -------------- (
        1: Sandwich,
        2: Drink,
        3: Side,
        4: Checkout,
        0: Cancel)

      - displaySandwichScreen()  -------------- (
        - Prompts for custom bread,
                             size,
                             meats,
                             toppings)
      - displayDrinkScreen()     -------------- (
        - Prompts for drink size
                        and flavor)
      - displaySideScreen()      -------------- (
        - Prompts for side size
                       and type)
      - displayCheckoutScreen()  -------------- (
        - Displays summary,
                   total,
               and handles 1: Confirm,
                           2: Cancel)
    = Edits / UI Customization   -- (
      - Add text color formatting,
      - neat ascii text borders
      - utilize emojis
      - clean console after each new screen

DATA (com.pluralsight.deli.services) =======
- OrderHistory / ReceiptManager
    = method:
      - writeReceipt(Order order) -
      - (Uses BufferedWriter to append details to a file)
    = exception handling               -
      - (try-with-resources for IOException)
    = logic: Generate unique file names using date/time stamps (YYYYMMDD-HHMMSS.txt)

APP (com.pluralsight.deli) =================
- Main / App Class
    = main method -
      - (Instantiates Menu and calls displayHomeScreen() to stat off the application)
 */

}
