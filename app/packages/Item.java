/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Item.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mbah <mbah@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/02/16 16:46:30 by mbah              #+#    #+#             */
/*   Updated: 2025/02/16 16:46:34 by mbah             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package app.packages;

public class Item
{
	private String name;

	public Item(String name)
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
		System.out.println("Item name: " + this.name);
	}
}
