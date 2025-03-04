/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Main.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mbah <mbah@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/02/13 18:12:49 by mbah              #+#    #+#             */
/*   Updated: 2025/03/04 14:39:31 by mbah             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import app.packages.Item;
import app.packages.Player;

public class Main
{
	public static void	main(String[] argv)
	{
		Item item;
		Player player;

		item =  new Item("Arrow");
		player = new Player("mbah", 23, 5);
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
