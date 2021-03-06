/*
 * Copyright 2016-2020 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * The license,see the LICENSE file.
 */

package org.teasoft.bee.file;

/**
 * 文件创建接口.File creator interface.
 * @author Kingstar
 * @since  1.7.1
 */
public interface FileCreator {
	/**
	 * 
	 * @param fullPathAndName 全部路径,包括文件名
	 * @param content 文件内容.content
	 */
	public  void genFile(String fullPathAndName, String content);
	
	/**
	 * 
	 * @param fullPath 全部路径.full path
	 * @param fileName 文件名.file name
	 * @param content  文件内容.content
	 */
	public  void genFile(String fullPath, String fileName, String content);
	
	/**
	 * 
	 * @param basePath 基础路径. base path
	 * @param packagePath 包路径.package path
	 * @param fileName 文件名.file name
	 * @param content  文件内容.content
	 */
	public  void genFile(String basePath,String packagePath, String fileName, String content);
	
}
