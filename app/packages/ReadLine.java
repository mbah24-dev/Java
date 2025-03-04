/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ReadLine.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mbah <mbah@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/03/04 15:08:06 by mbah              #+#    #+#             */
/*   Updated: 2025/03/04 15:19:21 by mbah             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package app.packages;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadLine {
	
	public ReadLine() {}
	
	public String	readLine()
	{
		BufferedReader reader;
		String 			response;
		
		response = "";
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
        	response = reader.readLine();
		} catch (Exception e) {
			System.out.println("Err: " + e);
		}
		return (response);
	}
}
