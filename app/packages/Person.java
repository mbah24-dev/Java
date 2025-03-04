/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Person.java                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mbah <mbah@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/03/04 14:14:38 by mbah              #+#    #+#             */
/*   Updated: 2025/03/04 14:37:41 by mbah             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package app.packages;

public abstract class Person implements IPerson
{
	protected int		age;
	protected String	name;

	Person(final int age, final String name)
	{
		this.age = age;
		this.name = name;
	}

	public int	getAge()
	{
		return (this.age);
	}

	public void	setAge(int age)
	{
		this.age = age;
	}

	public String	getName()
	{
		return (this.name);
	}

	public void	setName(String name)
	{
		this.name = name;
	}
}
