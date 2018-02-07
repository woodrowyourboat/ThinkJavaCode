package com.company;

import java.util.Scanner;
import java.util.TreeMap;

public class PetHotel
{
    private TreeMap<Integer, String> hotelRooms;

    public PetHotel()
    {
        hotelRooms = new TreeMap<>();
    }


    public static void main(String[] args)
    {
        PetHotel petHotel = new PetHotel();
        petHotel.run();

    }

    private void run()
    {
        Scanner scanner = new Scanner(System.in);
        String command;

        do
        {
            System.out.println("Enter command: ");
            String inputLine = scanner.nextLine();
            String[] words = inputLine.split(" ");
            command = words[0];

            if (command.equalsIgnoreCase("CheckIn"))
            {
                String petName = words[1];
                int roomNumber = Integer.parseInt(words[2]);

                if (roomNumber >= 100 && roomNumber <= 109)
                {
                    if (isRoomEmpty(roomNumber))
                    {
                        checkIn(petName, roomNumber);

                    }
                    else
                    {
                        System.out.println(" I'm sorry, but that room is currently occupied.");
                    }
                }
                else
                {
                    System.out.println(roomNumber + " is not a valid room number.");
                }
            }
            if (command.equalsIgnoreCase("CheckOut"))
            {
                String petName = words[1];
                int roomNumber = Integer.parseInt(words[2]);

                if (roomNumber >= 100 && roomNumber <= 109)
                {
                    if (isCorrectRoom(petName, roomNumber))
                    {
                        checkOut(petName, roomNumber);

                    }
                    else
                    {
                        System.out.println(petName + " is not currently in room " + roomNumber + ".");
                    }

                }
                else
                {
                    System.out.println(roomNumber + " is not a valid room number.");
                }
            }
            if (command.equalsIgnoreCase("Move"))
            {
                String petName = words[1];
                int fromRoomNumber = Integer.parseInt(words[1]);
                int toRoomNumber = Integer.parseInt(words[2]);

                if ((fromRoomNumber >= 100 && fromRoomNumber <= 109) && (toRoomNumber >= 100 && toRoomNumber <= 109))
                {
                    if (!isRoomEmpty(fromRoomNumber) && isRoomEmpty(toRoomNumber))
                    {
                        move(fromRoomNumber, toRoomNumber);

                    }
                    else if (isRoomEmpty(fromRoomNumber))
                    {
                        System.out.println("Room " + fromRoomNumber + "is not currently occupied.");
                    }

                }
                else
                {
                    System.out.println(toRoomNumber + " is not a valid room number.");
                }
            }

        }
        while (!command.equalsIgnoreCase("EXIT"));
    }

    private void checkIn(String petName, int roomNumber)
    {
        hotelRooms.put(roomNumber, petName);
        System.out.println(petName + " checked into room " + roomNumber + ".");
    }

    private void checkOut(String petName, int roomNumber)
    {
        hotelRooms.remove(roomNumber, petName);
        System.out.println(petName + " checked out of room " + roomNumber + ".");
    }

    private void move(int fromRoomNumber, int toRoomNumber)
    {
        String petName = hotelRooms.remove(fromRoomNumber);
        hotelRooms.put(toRoomNumber, petName);
        System.out.println(petName + " moved from " + fromRoomNumber + " to " + toRoomNumber + ".");
    }

    private boolean isRoomEmpty(int roomNumber)
    {
        boolean empty = true;

        if (hotelRooms.containsKey(roomNumber))
        {
            empty = false;
        }

        return empty;
    }

    private boolean isCorrectRoom(String petName, int roomNumber)
    {
        boolean correctRoom = false;

        if (hotelRooms.get(roomNumber).equals(petName))
        {
            correctRoom = true;
        }

        return correctRoom;
    }


}
