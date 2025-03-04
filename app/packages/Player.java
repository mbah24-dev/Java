/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Player.java                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mbah <mbah@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/02/16 16:46:27 by mbah              #+#    #+#             */
/*   Updated: 2025/03/04 14:41:07 by mbah             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package app.packages;

public class Player extends Person
{
	private int level;

	public Player(String name, int age, int level)
	{
		super(age, name);
		this.level = level;
	}

	public int	getLevel()
	{
		return (this.level);
	}

	public void	setLevel(int level)
	{
		this.level = level;
	}

	public void display()
	{
		System.out.println("Player name: " + this.name + " - Player age: " + this.age);
	}

	@Override 
	public void	say(String msg)
	{
		System.out.println(msg);
	}
}
