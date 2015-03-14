# no-health-hunger
## Bukkit plugin that disables health and hunger

### Features
* Disables health
* Disables hunger
* Teleports players in the void to spawn

### Permissions
|Node|Default|Description|
|:---|-------|----------:|
|NoHealthHunger.nohealth|OP|Player takes no damage|
|NoHealthHunger.nohunger|OP|Player loses no hunger|
|NoHealthHunger.escapevoid|TRUE|On entering void, player is teleported to spawn|

### Config
|Node|Sample|Description|
|:---|------|----------:|
|escapevoid.teleport_out_of_void|true|Set _false_ to prevent all players from escaping the void (NOTE: This overrides permissions!|
|escapevoid.message|Please don't go on spacewalks.|Message that players see when they are teleported _out_ of the void.|
|spawn.world|Server_lobby|The name of the world that your spawn point is located in. This is usually the name of the folder containing the world data files.|
|spawn.x|0.5|The x-coordinate of the spawn point. Press F3 in-game to view your coordinates.|
|spawn.y|3|The y-coordinate of the spawn point. Press F3 in-game to view your coordinates.|
|spawn.z|0.5|The z-coordinate of the spawn point. Press F3 in-game to view your coordinates.|