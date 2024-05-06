# App Report: Virtual Pet#
The Virtual Pet app is meticulously designed to replicate the joy and responsibility of owning a virtual pet. Within this delightful digital
world, users can engage with their virtual companions by feeding them, playing together, and ensuring their cleanliness. The app comprises 
two primary pages: the home page, where users manage their pet’s overall well-being, and the virtual pet page, where the magic truly unfolds.
Drawing inspiration from the iconic Tamagotchis in 1996 from the Japanese toy company Bandai, a virtual pet created by Aki Maita and 
Yokoi Akihiro to capture the essence of nurturing a tiny, pixelated creature. Like their real-world counterparts, users must attend to their 
virtual pets’ needs by feeding them, playing mini-games, and maintaining their health. Neglecting these responsibilities could lead to a digital demise, 
emphasizing the importance of care and connection. 

## Functionality:
The app's functionality revolves around the interaction with a virtual pet represented by a moving image, in other words a GIF. 
Users can perform the following actions on the virtual pet: 
- **Feeding:** Users can feed the pet by clicking on the "Eat" button. This action decreases the pet's hunger level by 20 units and increases its 
health level by 10 units. 
- **Cleaning:** Users can clean the pet by clicking on the "Clean" button. This action increases the pet's cleanliness level by 20 units and 
decreases its hunger level by 5 units. 
- **Playing:** Users can play with the pet by clicking on the "Play" button. This action decreases the pet's health level by 5 units, hunger level 
by 10 units, and cleanliness level by 10 units. 
- **Resetting:** Users can reset the pet's status to default values by clicking on the "Reset" button. 
- **Returning:** Users can go back to the starting screen of the app by clicking the “Back.” 

The starting screen of the app provides an introductory image and an “Enter” button to redirect them to the main screen of the app. The app provides visual feedback to users by displaying different images of the pet corresponding to its current activity such as eating, cleaning, playing. 

## Design:
The app's design follows the Material Design guidelines with a clean and intuitive layout. It utilizes ConstraintLayout to create a 
responsive UI that adapts well to different screen sizes. The use of buttons for interaction and ImageView for displaying the pet's image 
makes the app easy to navigate and understand. 
The home page features a single button called "Enter" for accessing the virtual pet page. Upon clicking the button, users are directed to the 
virtual pet page where they can interact with the pet using the provided buttons. 
The virtual pet page consists of buttons for feeding, cleaning, playing, resetting, and returning to the home page. Each button is 
appropriately labelled for clarity. Additionally, a TextView displays the pet's current status, including its health, hunger, and cleanliness 
levels which are determined by activity the pet is tasked to do. 
The app utilizes Glide, a popular image loading and caching library for Android, to efficiently load and display images of the pet. This 
ensures smooth performance and a visually appealing experience for users. 

The Virtual Pet app offers a simple yet enjoyable experience for users interested in virtual pet ownership. Its intuitive 
design and responsive UI make it accessible to a wide audience. However, there is room for improvement in terms of enhancing interaction, 
customization, and adding more features to enrich the user experience. With further development and refinement, the Virtual Pet app has the 
potential to become a beloved companion for users seeking virtual pet companionship. 

## YouTube video:  

https://youtu.be/8Am0zaQCHDw 

## References

Displaying Images Using Glide Library - Mastering Android Course #38. 2023. YouTube video, added by Master Coding. [Online]. 
Available at: https://www.youtube.com/watch?v=9_Tf3NSD2-M [Accessed 18 April 2024]. 

GeeksforGreeks. 2022. How to Use Glide Image Loader Library in Android Apps? 22 September 2022. [Online]. 
Available at: https://www.geeksforgeeks.org/image-loading-caching-library-android-set-2/ [Accessed 18 April 2024]. 
