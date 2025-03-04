/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Main.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mbah <mbah@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/02/13 18:12:49 by mbah              #+#    #+#             */
/*   Updated: 2025/03/04 15:19:08 by mbah             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import app.packages.Item;
import app.packages.Player;
import app.packages.ReadLine;

public class Main
{
	public static void	main(String[] argv)
	{
		Item 	item;
		Player 	player;
		ReadLine	read;

		read = new ReadLine();
		System.out.println("Entrer votre nom:");
		item =  new Item("Arrow");
		player = new Player(read.readLine(), 23, 5);
		item.display();
		player.display();
		item.setName("Gun");
		item.display();
		player.display();
		player.setAge(20);
		player.display();
		player.say("Hello " + player.getName());
	}
}
