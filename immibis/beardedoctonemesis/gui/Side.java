package immibis.beardedoctonemesis.gui;

public enum Side {
	Joined(immibis.beardedoctonemesis.mcp.Side.JOINED, "jars/bin/minecraft.jar"),
	Client(immibis.beardedoctonemesis.mcp.Side.CLIENT, "jars/bin/minecraft.jar"),
	Server(immibis.beardedoctonemesis.mcp.Side.SERVER, "jars/minecraft_server.jar");
	
	private Side(immibis.beardedoctonemesis.mcp.Side mcpside, String xpath) {
		this.mcpside = mcpside;
		this.xpath = xpath;
	}
	
	public final immibis.beardedoctonemesis.mcp.Side mcpside;
	public final String xpath;
}
