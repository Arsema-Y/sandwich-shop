## Sandwich Shop Design Diagram

Here is the class diagram modeling our system architecture:

```mermaid
classDiagram
    %% Core Interfaces and Abstract Classes
    class ItemPrice {
        <<interface>>
        +getPrice() double
    }

    class MenuItem {
        <<abstract>>
        -String name
        -String size
        +MenuItem(String name, String size)
        +getName() String
        +getSize() String
    }
    
    ItemPrice <|.. MenuItem : implements

    %% Model Package Child Classes
    class Sandwich {
        -String breadType
        -List~String~ toppings
        -List~String~ sauces
        -boolean isToasted
        +Sandwich(String name, String size, String breadType)
        +addTopping(String topping)
        +addSauce(String sauce)
        +setToasted(boolean isToasted)
        +getPrice() double
    }

    class Sides {
        -String saltLevel
        +Sides(String name, String size)
        +setSaltLevel(String saltLevel)
        +getPrice() double
    }

    class Drink {
        -boolean isHot
        +Drink(String name, String size)
        +setHot(boolean isHot)
        +getPrice() double
    }

    MenuItem <|-- Sandwich : extends
    MenuItem <|-- Sides : extends
    MenuItem <|-- Drink : extends

    %% Order Management
    class Order {
        -List~MenuItem~ orderItems
        +addItem(MenuItem item)
        +removeItem(MenuItem item)
        +getOrderItems() List~MenuItem~
        +calculateOrderTotal() double
    }
    Order "1" --> "*" MenuItem : contains using Streams

    %% Data Package
    class OrderHistory {
        +writeReceipt(Order order) void
    }

    %% UI Package
    class Menu {
        -Scanner scanner
        -Order currentOrder
        +displayHomeScreen() void
        +displayOrderScreen() void
        +displaySandwichScreen() void
        +displaySidesScreen() void
        +displayDrinkScreen() void
        +displayCheckoutScreen() void
    }

    %% Application Entry Point
    class App {
        +main(String[] args) void
    }

    %% Package Associations
    Menu --> Order : manages
    Menu --> OrderHistory : triggers
    App --> Menu : runs