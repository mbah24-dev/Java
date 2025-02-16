/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   main.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mbah <mbah@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/02/13 18:12:49 by mbah              #+#    #+#             */
/*   Updated: 2025/02/16 16:45:04 by mbah             ###   ########.fr       */
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
		player = new Player("mbah");
		item.display();
		player.display();
		item.setName("Gun");
		item.display();
		player.display();
	}
}
