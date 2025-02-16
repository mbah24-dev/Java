/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Player.java                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mbah <mbah@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/02/16 16:46:27 by mbah              #+#    #+#             */
/*   Updated: 2025/02/16 16:46:28 by mbah             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package app.packages;

public class Player
{
	private String name;

	public Player(String name)
	{
		this.name = name;
	}

	public String	getName()
	{
		return (this.name);
	}

	public void	setName(String name)
	{
		this.name = name;
	}

	public void display()
	{
		System.out.println("Player name: " + this.name);
	}
}
