Car Parking System in Java This Java project implements a versatile car parking system with a modular design. The system supports various functionalities such as initialization, adding/removing vehicles, and checking availability. It includes a flat cost structure for parking fees and is designed to be flexible for future extensions.
Classes ParkingLot: Manages parking spaces. Vehicle: Represents vehicles with essential attributes. Floor: Represents parking lot floors with capacity details. VehicleSpace: Represents individual parking spaces. CostStrategy: Manages cost calculation based on vehicle type. Usage Initialization:
Configure the parking lot with desired floors and spaces per floor. Add Vehicle:
Use the addVehicle method to add vehicles with details like type, registration number, and color. Remove Vehicle:
Remove vehicles by specifying the registration number or token. Check Availability:
Verify available vehicle spaces on a specific floor for a given vehicle type using checkAvailability. Cost Structure Bike: ₹10 per hour Car/Jeep: ₹20 per hour Bus/Truck: ₹30 per hour Use Case Initialization for Cars:
Set up the parking lot for two cars. Vehicle Entry:
Add details for two cars, generating a token ID for each with a timestamp. Vehicle Exit:
Validate tokens and timestamps to retrieve car details along with the total parking fee. Capacity Full:
Attempting to enter a third car when the capacity is full should result in an error. Project Expectations Main method in the Java code project. Configuration initialization for capacity, floors, vehicle types, currency, and hourly charges. Vehicle entry and exit using either registration number or token.
